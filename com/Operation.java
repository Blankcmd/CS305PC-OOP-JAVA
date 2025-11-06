package Student;

interface Operation{
	abstract void register(Student std);
	abstract void login(String id , String password);
	abstract void exit();
}