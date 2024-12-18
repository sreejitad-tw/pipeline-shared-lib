def checkout_func (Map details){
    def scmConfig = [
        $class: 'GitSCM',
        branches: [[name: "*/${details.branch}"]],
        userRemoteConfigs: [[url: deatils.url]]
    ]
    checkout scm: scmConfig

}
    