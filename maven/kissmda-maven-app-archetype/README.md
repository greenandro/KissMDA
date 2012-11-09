KissMDA Maven Archetype for Application Developers
==================================================
This archetype helps you to begin your simple Java Maven project.

To run the archetype:

```
mvn archetype:generate 
  -DarchetypeGroupId=de.crowdcode.kissmda.maven.archetype 
  -DarchetypeArtifactId=kissmda-maven-app-archetype 
  -DarchetypeVersion=1.0.0-SNAPSHOT 
  -DgroupId="my-groupid" 
  -DartifactId="my-artifactId"
  -DprojectName="my-project-name"
  -DprojectDescription="my-project-description"
```
  
where:
 * **"my-groupid"** == my newly created KissMDA app Maven group
 * **"my-artifactId"** == my newly creadted KissMDA app Maven artifact
 * **"my-project-name"** == the name of my project
 * **"my-project-description"** == the description of my project