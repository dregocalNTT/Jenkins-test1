pipeline {
    agent {  label 'java'     }
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
                bat 'mvn -B -DskipTests clean package'
            }
        }
    }
}