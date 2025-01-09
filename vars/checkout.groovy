def checkout_func (Map details){
        scmGit(
            branches: [[name:  details.branch ]],
            userRemoteConfigs: [[ url: details.url ]]
        )

}
    