def checkout_func (Map details){
    checkout(
        scmGit(
            branches: [[name:  details.branch ]],
            userRemoteConfigs: [[ url: details.url ]]
        )
    )

}
    