pipeline {
    agent any

    stages {
        stage('Pull code') {
            git 'https://github.com/Hyman1993/myblog.git'
            echo 'git clone successfully..'
        }
        stage('Build') {
            steps {
                echo 'Building..'
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