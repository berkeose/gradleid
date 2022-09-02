pipeline {
    agent any

    tools {
        
        maven "maven"
    }

    stages {
        stage('Build') {
            steps {

             sh "mvn -Dmaven.test.failure.ignore=true clean package"
             
            }

            post {
               
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}