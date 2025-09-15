pipeline {
    agent {  label 'java'     }
    environment {
        TEXT = credentials('test_text')
    }
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
                bat 'mvn -B -DskipTests clean package -DmySecret="${TEXT}"'
            }
        }
    }
}