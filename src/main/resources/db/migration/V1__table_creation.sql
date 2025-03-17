CREATE TABLE Staff (
                       staff_id SERIAL PRIMARY KEY,
                       first_name VARCHAR(50) NOT NULL,
                       last_name VARCHAR(50) NOT NULL,
                       email VARCHAR(100) UNIQUE NOT NULL,
                       phone_number VARCHAR(20),
                       job_position VARCHAR(50),
                       hire_date DATE NOT NULL
);

CREATE TABLE Instructor (
                            instructor_id SERIAL PRIMARY KEY,
                            staff_id INT UNIQUE NOT NULL REFERENCES Staff(staff_id) ON DELETE CASCADE,
                            biography TEXT
);

CREATE TABLE Student (
                         student_id SERIAL PRIMARY KEY,
                         first_name VARCHAR(50) NOT NULL,
                         last_name VARCHAR(50) NOT NULL,
                         email VARCHAR(100) UNIQUE NOT NULL,
                         phone_number VARCHAR(20),
                         date_of_birth DATE NOT NULL,
                         university VARCHAR(100),
                         college VARCHAR(100),
                         graduation_grade VARCHAR(10)
);

CREATE TABLE Courses (
                         course_id SERIAL PRIMARY KEY,
                         title VARCHAR(100) NOT NULL,
                         description TEXT,
                         duration INT CHECK (duration > 0),
                         start_date DATE NOT NULL,
                         end_date DATE NOT NULL
);

CREATE TABLE Course_Instructor (
                                   instructor_id INT REFERENCES Instructor(instructor_id) ON DELETE SET NULL,
                                   course_id INT REFERENCES Courses(course_id) ON DELETE CASCADE,
                                   PRIMARY KEY (instructor_id, course_id)
);

CREATE TABLE Enrollment (
                            student_id INT REFERENCES Student(student_id) ON DELETE CASCADE,
                            course_id INT REFERENCES Courses(course_id) ON DELETE CASCADE,
                            enrollment_date DATE NOT NULL,
                            status VARCHAR(20) CHECK (status IN ('active', 'completed', 'dropped')),
                            PRIMARY KEY (student_id, course_id)
);

CREATE TABLE Session (
                         session_id SERIAL PRIMARY KEY,
                         course_id INT REFERENCES Courses(course_id) ON DELETE CASCADE,
                         session_date TIMESTAMP NOT NULL,
                         location VARCHAR(255),
                         session_topic TEXT NOT NULL
);

CREATE TABLE Assignment (
                            assignment_id SERIAL PRIMARY KEY,
                            course_id INT REFERENCES Courses(course_id) ON DELETE CASCADE,
                            title VARCHAR(255) NOT NULL,
                            description TEXT,
                            due_date DATE NOT NULL
);

CREATE TABLE Student_Assignment (
                                    student_id INT REFERENCES Student(student_id) ON DELETE CASCADE,
                                    assignment_id INT REFERENCES Assignment(assignment_id) ON DELETE CASCADE,
                                    submit_date DATE,
                                    PRIMARY KEY (student_id, assignment_id)
);

