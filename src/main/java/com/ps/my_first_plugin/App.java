package com.ps.my_first_plugin;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "coverage")
public class App extends AbstractMojo {

	@Parameter(property = "relativePath")
	private String relativePath;

	public void execute() throws MojoExecutionException, MojoFailureException {
		try {
			String absolutePath = FileSystems.getDefault().getPath(relativePath).normalize().toAbsolutePath().toString();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(new File(absolutePath));
			Scanner dataScanner = null;
			int totalMissed = 0;
			int totalCovered = 0;
			List<Component> componentList = new ArrayList<Component>();
			@SuppressWarnings("unused")
			String headerLine = scanner.nextLine();
			System.out.println("*****************************************");
			System.out.println("    Class Name                   Coverage");
			System.out.println("*****************************************");
			while (scanner.hasNextLine()) {
				dataScanner = new Scanner(scanner.nextLine());
				dataScanner.useDelimiter(",");
				Component component = new Component();
				dataScanner.next();
				dataScanner.next();
				component.setClassname(dataScanner.next());
				int missed = Integer.parseInt(dataScanner.next());
				totalMissed += missed;
				int covered = Integer.parseInt(dataScanner.next());
				totalCovered += covered;
				int percentage = (int) ((covered * 100) / (covered + missed));
				component.setCoverage(percentage);
				componentList.add(component);
			}
			printTable(componentList);
			System.out.println("*****************************************");
			System.out.println(
					"    Total Coverage                  " + ((totalCovered * 100) / (totalCovered + totalMissed)));
			System.out.println("*****************************************");
		} catch (FileNotFoundException e) {
			System.out.println("Something went wrong, check the following:");
			System.out.println("1. plugin responsible for generating the report");
			System.out.println("2. path to the report generated");
		}

	}

	public void printTable(List<Component> componentList) {
		for (int index = 0; index < componentList.size(); index++) {
			System.out.println("-----------------------------------------");
			Component component = componentList.get(index);
			System.out.print("|   ");
			System.out.print(component.getClassname());
			int gap = 27 - component.getClassname().length();
			for (int i = 0; i < gap; i++) {
				System.out.print(" ");
			}
			System.out.print("|   ");
			System.out.print(component.getCoverage());
			gap = 6 - (component.getCoverage() + "").length();
			for (int i = 0; i < gap; i++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
}
