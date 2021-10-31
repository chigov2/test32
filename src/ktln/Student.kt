package ktln

data class Student (val name: String, val lastName: String, val id: String){
    fun copy_(name: String= this.name, lastName: String = this.lastName, id: String = this.id): Student{

        return Student(name,lastName,id)
    }

}