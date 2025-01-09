def checkout_func (Map details){
    checkout(
        scmGit(
            branches: [[name:  details.branch ]],
            remote: [[ url: details.url ]]
        )
    )

}
    