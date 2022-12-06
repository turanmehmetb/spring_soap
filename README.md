# spring_soap

request with xml files;

curl --header "content-type: text/xml" -d @list.xml http://localhost:8080/ws
curl --header "content-type: text/xml" -d @add.xml http://localhost:8080/ws
curl --header "content-type: text/xml" -d @cancel.xml http://localhost:8080/ws
