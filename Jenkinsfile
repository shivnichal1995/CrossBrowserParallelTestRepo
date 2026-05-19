pipeline {

    agent any

    stages {

        stage('Checkout') {

            steps {

                git 'https://github.com/yourname/selenium-cucumber-fw.git'
            }
        }

        stage('Run Parallel Tests') {

            steps {

                sh 'mvn clean test'
            }
        }
    }

    post {

        always {

            junit '**/surefire-reports/*.xml'

            archiveArtifacts artifacts:
                    'target/cucumber-report.html'
        }
    }
}