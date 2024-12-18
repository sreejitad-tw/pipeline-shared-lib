def checkout_func (map details){
     checkout scmGit([
            $class: 'GitSCM',
            userRemoteConfigs: [[url: details.url]],
            branches: [[name: details.branch]]
         ])
}
    