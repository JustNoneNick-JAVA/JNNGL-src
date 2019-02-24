package com.jnngl.library.generator.manifest;

public class ManifestGenerator {
	
	public String generate(int version, String ant_version, String java_version) {
		return "Manifest-Version: " + version + "\n" + "Ant-Version: " + ant_version + "\n" + "Created-By: " + java_version + " (JNNGL Library)";
	}

	public String generate(double version, String ant_version, String java_version) {
		return "Manifest-Version: " + version + "\n" + "Ant-Version: " + ant_version + "\n" + "Created-By: " + java_version + " (JNNGL Library)";
	}
	
}
