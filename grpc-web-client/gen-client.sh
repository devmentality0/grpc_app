protoc \
	    -I=../grpc-backend/src/main/protobuf hello.proto \
	    --js_out=import_style=commonjs:./generated \
	    --grpc-web_out=import_style=commonjs,mode=grpcwebtext:./generated
