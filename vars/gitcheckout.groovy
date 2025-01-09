def checkout_func (Map details){
    checkout(
        scmGit(
            $class: 'GitSCM',
            branches: [[name:  details.branch ]],
            remote: [[ url: details.url ]]
        )
    )

}
    