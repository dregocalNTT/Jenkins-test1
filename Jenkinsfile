pipeline {
    agent { docker { 
        image 'mcr.microsoft.com/powershell'
        } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}