pipeline {

    agent any

    stages {

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

            junit allowEmptyResults: true,
                   testResults:
                   '**/surefire-reports/*.xml'

            archiveArtifacts allowEmptyArchive: true,
                             artifacts:
                             'target/cucumber-report.html'
        }
    }
}