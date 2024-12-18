def checkout (map details){
     checkout( [
            $class: 'GitSCM',
            userRemoteConfigs: [[url: details.url]],
            branches: [[name: details.branch]]
         ])
}
    