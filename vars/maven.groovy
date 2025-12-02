def call(List command){
    for(cmd in command){
        sh "mvn ${cmd}"
    }
g}