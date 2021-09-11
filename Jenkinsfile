pipeline {
  agent any
   tools { 
        maven 'Maven 3.8.2' 
        jdk 'openjdk-11' 
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building Artifact'
        sh 'mvn -B -DskipTests clean package'
      }
    }

  }
}
