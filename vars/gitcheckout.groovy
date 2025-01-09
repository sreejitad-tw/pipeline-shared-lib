def call (Map details){
    checkout([
            $class: 'GitSCM',
            branches: [[name:  details.branch ]],
            userRemoteConfigs: [[ url: details.url ]]
    ]
    )

}
    