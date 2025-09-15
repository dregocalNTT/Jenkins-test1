pipeline {
    agent {  label 'java'     }
    environment {
        TEXT = credentials('test_text')
    }
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Run JAR') {
            steps {
                bat 'java -jar target/demo-1.0-SNAPSHOT.jar %TEXT%'
            }
        }
    }
}