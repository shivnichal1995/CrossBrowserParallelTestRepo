pipeline {

    agent any

    stages {

        stage('Checkout Code') {

            steps {

                git 'https://github.com/shivnichal1995/CrossBrowserParallelTestRepo.git'
            }
        }

        stage('Parallel Cross Browser Tests') {

            parallel {

                stage('Chrome Tests') {

                    steps {

                        bat 'mvn clean test -Dbrowser=chrome'
                    }
                }

                stage('Firefox Tests') {

                    steps {

                        bat 'mvn clean test -Dbrowser=firefox'
                    }
                }
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