/**
 * 
 */
package CoreJavaTopics;

/**
 * @author Tousif
 *
 */
public class OverridingEqualsAndHashCode{

	@SuppressWarnings("unused")
	private class Person2{

		private String firstName;
		private String lastName;
		private Integer age;


		public Person2(String firstName, String lastName, Integer age) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
		}

		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person2 [firstName=" + firstName + ", lastName=" + lastName + ", Age=" + age + "]\n";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((age == null) ? 0 : age.hashCode());
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person2 other = (Person2) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (age == null) {
				if (other.age != null)
					return false;
			} else if (!age.equals(other.age))
				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			return true;
		}

		private OverridingEqualsAndHashCode getOuterType() {
			return OverridingEqualsAndHashCode.this;
		}
	}
}
