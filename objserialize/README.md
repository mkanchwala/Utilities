# Object Serialiazation using @JsonType

Sample application to show how to cast the Objects on the Runtime using @JsonType

You can use this in your Spring Application, You can configure the ObjectMapper in your AppContext and then you can add it to your HttpMessageConvertes then while performing Marshalling or UnMarshalling it'll use the 'objType' to understand that in which type of the Object it should be casted.

Please file an issue if you want more details on the same. Thanks