pipeline {
  agent any
   tools { 
        maven 'Maven 3.8.2' 
        jdk 'JDK11' 
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building Artifact'
        sh 'mvn -B -DskipTests clean package'
      }
    }
    stage("OCI Upload Artifact") {  
      steps {  
        OCIUploadArtifact(credentialsId: 'ocidevops', uploadArtifactDetailsList: [[artifactPath: 'super-store/product-service', repositoryId: 'ocid1.artifactrepository.oc1.eu-frankfurt-1.0.amaaaaaa36thv6aag7l52akya6ggxorsarvcmblgih7zonxwrclldve2ewca', repositoryType: 'GENERIC', sourcePath: 'target/product-service-0.0.1-SNAPSHOT.jar', version: '0.0.1-SNAPSHOT']])  
      }  
    }

  }
}
