pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building Artifact'
        sh 'mvn -B -DskipTests clean package'
      }
    }

  }
}
