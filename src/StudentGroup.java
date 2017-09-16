import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
                 if(length==0)
                throw new IllegalArgumentException("Invalid operation");
else return student[0];
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
            if()

	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
         
             
        
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here

              if(students[index]==null)
              throw new IllegalArgumentException("Invalid operation");
              else if(index<0||index>)          
              
	
            
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
               if(students[index]==null)
               throw new IllegalArgumentException("Invalid operation");
               else if(index<0||index>students.length())
                throw new IllegalArgumentException("Invalid length");
                students[students.length()+1]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here

        try
        {
          if(index<0||index>=students.length)
          {
           throw IllegalArgumentException;
          }
          else
           {
            students = ArrayUtils.remove(students, index);
           }
        }
        catch(IllegalArgumentException ie1)
          System.out.println("IllegalArgumentException");
        
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
          try
           {
             int flag=0;
            for(i=0;i<students.length;i++)
                {
 		 if(students.id==this.id)
		    {
			flag=1;
			students = ArrayUtils.remove(students, this.id);
                       return;
                    }
		}
               if(flag==0)
                { System.out.println("Student not exist");
			throw IllegalArgumentException;}
              
           }
           catch(IllegalArgumentException ie2)
		System.out.println("Student not exist");
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
            try
            {
                  if(index<0||index>=students.length())
                      throw IllegalArgumentException;
             for(int i=0;i<students.length();i++)
 		{
			if(index==students.index)
                         students = ArrayUtils.remove(students, index);
		}
               
             }
		catch(IllegalArgumentException ie3)
		System.out.println("IllegalArgumentException");
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		try
		{int flag=0;
			for(i=0;i<students.length();i++)
			{
				if(this.id==student.id)
				{ flag=1;	students = ArrayUtils.remove(students, id);}
			}
                     if(flag==1) 
			throw IllegalArgumentException;
		}
		catch(IllegalArgumentException ie4)
		{System.out.println("IllegalArgumentException");}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
              try
               {int i=0;
                   if(index<0||index>=Student.length())
                     throw IllegalArgumentException;
                for(i=0;i<Student.length();i++)
                  {
                   if(this.index==index)
                      students = ArrayUtils.remove(students, index);
  	           }
               }
		catch(IllegalArgumentException ie5)
                {
              System.out.println("IllegalArgumentException");
                }
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
 	try
               {int i=0,flag=0;
                   
                for(i=0;i<Student.length();i++)
                  {
                   if(this.id==Student.id)
                      {flag=1;   students = ArrayUtils.remove(students, id);}
  	           }
                  if(flag==1)
                     throw IllegalArgumentException;
               }
		catch(IllegalArgumentException ie6)
                {
              System.out.println("IllegalArgumentException");
                }

	}

	@Override
	public void bubbleSort() {
		// Add your implementation here

		int n,i,j;
                Student[] t;
                n=Student.length();
               for(i=0;i<n;i++)
                 {
                  for(j=0;j<n-i-1;j++)
                   {
                       if(Student[j].id>Student[j+1].id)
                         {
                             t=Student[j];Student[j]=Student[j+1];Student[j+1]=t;
                         }
                    }
                 }
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
                  try
                  {
                    int flag=0,j=0;
                     Student[] s;
                      s[]=new int[Student.length()];
			for(int i=0;i<Student.length();i++)
                         {
				if(Student.birthDate==this.date)
                                 { flag=1; s[j++]=Student[i];}
			 }
                         
                        if(flag==1)
                         throw IllegalArgumentException;
			else return s;
			}
                        catch(IllegalArgumentException ie6)
                         {}

		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		try
                  {
                    int j=0;
                     Student[] s;
                      s[]=new int[Student.length()];
			for(int i=0;i<Student.length();i++)
                         {
				if(Student.birthDate>firstDate&&Student.birthDate<lastDate)
                                 {  s[j++]=Student[i];}
			 }
                         
                        if(firstDate==NULL||lastDate==NULL)
                         throw IllegalArgumentException;
			else return s;
			}
                        catch(IllegalArgumentException ie6)
                         {}

	
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
               
		try
                  {
                    int j=0;
                     Date nextDate = addDays(date, days);
                     Student[] s;
                      s[]=new int[Student.length()];
			for(int i=0;i<Student.length();i++)
                         {
				if(Student.birthDate>date&&Student.birthDate<nextDate)
                                 {  s[j++]=Student[i];}
			 }
                         
                        if(date==NULL)
                         throw IllegalArgumentException;
			else return s;
			}
                        catch(IllegalArgumentException ie6)
                         {}

		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
                try
		{
                 if(indexOfStudent==0)
                    throw IllegalArgumentException;
  			Student[] s;
                      s[]=new int[Student.length()];
		int i=0,j=0;
 		for(i=0;i<Student.length();i++)
                {
			if(indexOfStudent==i)
                         {
		          Years age1 = Years.yearsBetween(birthDate, now);
                            s[j++]=age1;

			}
		}
                 return s;
                
		}
                catch(IllegalArgumentException ie7)
                   {}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here

		  try
		{
  			Student[] s;
                      s[]=new int[Student.length()];
		int i=0,j=0;
 		for(i=0;i<Student.length();i++)
                {
	
		          Years age1 = Years.yearsBetween(birthDate, now);
                        if(age==age1){    s[j++]=Student[i];

			}
		}
                return s;
                
		}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here

		  try
		{
                       double avg1=0;
  			Student[] s;
                      s[]=new int[Student.length()];
		int i=0,j=0;
 		for(i=0;i<Student.length();i++)
                {
	
		          
                        if(avg1<Student.avgMark){avg1=Student.avgMark;    

			}
		}
		for(i=0;i<Student.length();i++)
                {
	
		          
                        if(avg1==Student.avgMark){s[j++]=Student[i];    

			}
		}
                return s;
                
		}
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		 try
		{
                       if(Student[++i]==null)
  			throw IllegalArgumentException;
                        else

                return Student;
                
		}
 		catch(IllegalArgumentException ii){}
		return null;
	}
}
