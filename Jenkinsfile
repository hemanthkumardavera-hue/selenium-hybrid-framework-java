pipeline {

    agent any

    stages {

        stage('Checkout') {

            steps {

                echo 'Checking out source code'

            }
        }

        stage('Build') {

            steps {

                bat 'mvn clean compile'

            }
        }

    stage('API Tests') {

    steps {

        catchError(
            buildResult: 'SUCCESS',
            stageResult: 'FAILURE') {

            bat 'mvn test -DsuiteXmlFile=suites/api.xml'
         }
      }
  }

        stage('DB Tests') {

            steps {

                bat 'mvn test -DsuiteXmlFile=suites/db.xml'

            }
        }

        stage('UI Tests') {

            steps {

                bat 'mvn test -DsuiteXmlFile=suites/smoke.xml'

            }
        }
    }
}