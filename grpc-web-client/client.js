const {HelloServiceClient} = require('./generated/hello_grpc_web_pb.js');
const {HelloRequest, HelloResponse} = require('./generated/hello_pb.js');

const client = new HelloServiceClient('http://localhost:8080', {}, {
  'withCredentials': true
});

const request = new HelloRequest();
request.setMessage('Nikita!');

client.sayHello(request, {}, (err, response) => {
  console.log(response.getMessage());
});

//client.sayHello(request, {});
