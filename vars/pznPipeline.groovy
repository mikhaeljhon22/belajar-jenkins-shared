def call(Map config){
    if(config.type == "maven"){
        mavenPipeline()
    }else{
        println("Pipeline type not supportedg")
    }
}