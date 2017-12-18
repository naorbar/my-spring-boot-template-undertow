package com.nnn.tools.tool1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nnn.tools.tool1.service.Tool1Service;

/**
 * This is the main entry of tool1 console application used for testing
 * @author barna10
 */
public class StartConsole {

	private static final Logger log = LogManager.getLogger();
	
	/**
	 * Start this console to get two IM directories, compare two imsManagedObject and generate the compare outputs accordingly<BR>
	 * This method doens't replace the web UI and is used for testing purposes only.
	 * @author barna10
	 */
	public static void main(String[] args) {
		
		try {
			Tool1Service service = new Tool1Service();
			
			System.out.print("Use this console get IM directories, compare two imsManagedObject and generate the compare outputs accordingly;\n" +
					"Note: Use this console for testing purposes only; for production, use the Web interface!");
			
			Scanner scanner = new Scanner(System.in);

			loop: while (true) {

				// Variable used in all options:
				Map<String, String> dirMap = new HashMap<String, String>(); 
				String host = null;
				String port = "8080";
				Boolean isSSL = false;
				String username = "imadmin";
				String password = null;
				String cookie = null;
				String directoryId = null;
				String managedObject = null;
				
				System.out.print("\n\nPlease choose one of the following options:" +
						"\n\t(1) Get available IM directories map [online]" + 
						"\n\t(2) Get available IM managed objects [online]" + 
						"\n\t(3) Get available IM managed objects [offline]" + 
						"\n\t(4) Save IM managed object to json file [online]" + 
						"\n\t(5) Save IM managed object to json file [offline]" + 
						"\n\t(6) Compare two IM managed objects (from json files)" + 
						"\n\t(7) Generate Migration Outputs (from json files)" + 
						"\n\t(q) quit - quit");
				System.out.print("\n\nEnter your input here:");
				String input = scanner.nextLine();

				switch (input) {
				case "q": case "quit":
					System.out.println("Aborting...");
					break loop;
				case "1": case "Get available IM directories map [online]":
					try {
						System.out.print("Please specify IM host:");
						host = scanner.nextLine();
						// TODO
						// TODO
						
					} catch (Exception e) {
						System.out.println("Error: Could not complete the specified operation - " + e.getMessage());
						break;
					}
					break;
				case "2": case "Get available IM managed objects [online]":
					try {
						System.out.print("Please specify IM host:");
						host = scanner.nextLine();
						
						// TODO
						// TODO
						// TODO
						
						
					} catch (Exception e) {
						System.out.println("Error: Could not complete the specified operation - " + e.getMessage());
						break;
					}
					break;
				case "3": case "Get available IM managed objects [offline]":
					try {
						System.out.print("\nPlease enter a file path containing the userstore xml:");
						
						// TODO
						// TODO
						// TODO
						
					} catch (Exception e) {
						System.out.println("Error: Could not complete the specified operation - " + e.getMessage());
						break;
					}
					break;
				case "4": case "Save IM managed object to json file [online]":
					try {
						System.out.print("Please specify IM host:");
						host = scanner.nextLine();
						
						// TODO
						// TODO
						
					} catch (Exception e) {
						System.out.println("Error: Could not complete the specified operation - " + e.getMessage());
						break;
					}
					break;
				case "5": case "Save IM managed object to json file [offline]":
					try {
						System.out.print("\nPlease enter a file path containing the userstore xml:");
						String userStoreFilePath = scanner.nextLine();
						// TODO
						// TODO
						
					} catch (Exception e) {
						System.out.println("Error: Could not complete the specified operation - " + e.getMessage());
						break;
					}
					break;
				case "6": case "Compare two IM managed objects (from json files)":
					try {
						System.out.print("\nPlease enter a file path containing the first IM managed object:");
						String sourceFile1 = scanner.nextLine();
						while (!new File(sourceFile1).exists()) {
							System.out.println("Illegal input... no such file: " + new File(sourceFile1));
							System.out.print("\nPlease enter a file path containing the first IM managed object:");
							sourceFile1 = scanner.nextLine();
						}
						System.out.print("\nPlease enter a file path containing the second IM managed object:");
						String sourceFile2 = scanner.nextLine();
						while (!new File(sourceFile2).exists()) {
							System.out.println("Illegal input... no such file: " + new File(sourceFile2));
							System.out.print("\nPlease enter a file path containing the first IM managed object:");
							sourceFile2 = scanner.nextLine();
						}
						
						// TODO
						// TODO
						
					} catch (Exception e) {
						System.out.println("Error: Could not complete the specified operation - " + e.getMessage());
						break;
					}
					break;
				case "7": case "Generate Migration Outputs (from json files)":
					try {
						System.out.print("\nPlease enter a file path containing the source IM managed object:");
						String sourceFile = scanner.nextLine();
						
						// TODO
						// TODO
						
						
					} catch (Exception e) {
						System.out.println("Error: Could not complete the specified operation - " + e.getMessage());
						break;
					}
					break;
				default:
					System.out.println("Illegal input...");
					break;
				}
			}
			scanner.close();
			return;
		} catch (Exception e) {
			log.error("Failed - " + e.getCause() + " - " + e.getMessage());
		}
	}
	
}
