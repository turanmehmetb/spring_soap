# spring_soap

run com.e_booking.schema.Application file
request with xml files;

curl --header "content-type: text/xml" -d @list.xml http://localhost:8080/ws <br/>
curl --header "content-type: text/xml" -d @add.xml http://localhost:8080/ws <br/>
curl --header "content-type: text/xml" -d @cancel.xml http://localhost:8080/ws <br/>
