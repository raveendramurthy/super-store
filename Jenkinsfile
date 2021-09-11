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
        OCIUploadArtifact(credentialsId: 'de822596-4b6e-4bdd-82e3-aa3b5d7ae10b', uploadArtifactDetailsList: [[artifactPath: 'super-store/product-service', repositoryId: 'ocid1.artifactrepository.oc1.eu-frankfurt-1.0.amaaaaaa36thv6aag7l52akya6ggxorsarvcmblgih7zonxwrclldve2ewca', repositoryType: 'GENERIC', sourcePath: '/var/jenkins_home/workspace/super-store_master/target/product-service-0.0.1-SNAPSHOT.jar', version: "0.0.1-SNAPSHOT"]])  
      }  
    }

  }
}
