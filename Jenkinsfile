pipeline {
    agent any

    stages {
        stage('Pull code') {
            steps {
                git 'https://github.com/Hyman1993/myblog.git'
                echo 'git clone successfully..'
            }
        }
        stage('Build') {
            steps {
                sh 'gradle build'
                echo 'Building successfully..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}