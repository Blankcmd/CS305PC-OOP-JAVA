package Student;

interface Operation{
	abstract void register(Student sid);
	abstract void login(String id , String password);
	abstract void exit();
}
