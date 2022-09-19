node {
    // 체크아웃
    stage('CheckOut'){
        checkout scm
        echo "CheckOut Complete"
    }
    stage('Gradle Build'){
        sh 'gradle clean'
        echo "Gradle~!!!!"
    }
}