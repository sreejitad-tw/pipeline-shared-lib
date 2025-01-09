def checkout_func (Map details){
    checkout([
            $class: 'GitSCM',
            branches: [[name:  details.branch ]],
            userRemoteConfigs: [[ url: details.url ]]
    ]
    )

}
    