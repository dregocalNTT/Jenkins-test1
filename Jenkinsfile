pipeline {
    agent {
        docker {
            image 'maven:3.9.11-eclipse-temurin-21-alpine'
            args '-v /c/ProgramData/Jenkins/.jenkins/workspace/pipeline-test_main:/workspace -w /workspace'
        }
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
