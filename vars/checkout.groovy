def checkout_func (Map details){
     checkout ([
            $class: 'GitSCM',
            userRemoteConfigs: [[url: details.url]],
            branches: [[name: details.branch]]
         ])
}
    