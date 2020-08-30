# MasteringGradle

#### Use this to initialize a project as Gradle project
`gradle init`

#### To create gradle wrapper
`gradle wrapper ` 

#### Important Gradle files 
1. build.gradle - contains the plugins, dependencies, repositories, project information
2. settings.gradle - contains root project name, information about sub-project
3. gradle/wrapper/gradle-wrapper.properties - wrapper over gradle (used to make sure that correct version of gradle is used across development machines and CI system).
4. gradlew, gradlew.bat - used to run commands with gradle wrapper
5. build dir - contains generated class files, jar, reports (based on plugin)

#### Important section of build.gradle file 
1. plugins - using plugins section and apply plugin
2. repositories - central, company specific artifactory etc. 
3. tasks - new tasks as well as customization of existing tasks
4. group - group id
5. version - project version 
6. dependencies - used to list dependency with other projects 

#### Used to list available projects (helpful if it is a multi-project)
`gradlew projects`

#### Used to list available tasks. Tasks can come from plugins defined
`gradlew tasks`

#### Used to list available properties and properties can be referenced using project Object 
`gradlew properties`

#### Run a particular available task
`gradlew <task_name>`

#### More information can be found on - 
https://guides.gradle.org/creating-multi-project-builds/

https://medium.com/@andrewMacmurray/a-beginners-guide-to-gradle-26212ddcafa8 


