// define test user variable

// define HttpSession variable


// autowire MockMvc object


// autowire UserRepository


// autowire PostRepository


// autowire PasswordEncoder


// ======= before running tests, find test user or create one, then 'login'

/*
testUser = userDao.findByUsername("testUser");
// Creates the test user if not exists
if(testUser == null){
User newUser = new User();
newUser.setUsername("testUser");
newUser.setPassword(passwordEncoder.encode("pass"));
newUser.setEmail("testUser@codeup.com");
testUser = userDao.save(newUser);
}
*/

// upon logging in, set the session
/*
httpSession = this.mvc.perform(post("/login").with(csrf())
.param("username", "testUser")
.param("password", "pass"))
.andExpect(status().is(HttpStatus.FOUND.value()))
.andExpect(redirectedUrl("/posts"))
.andReturn()
.getRequest()
.getSession();
*/


// sanity test to assert that the session is not null

// test post index view

    // expect that status is ok
    // expect content of response to include header title
    // expect content to contain string of a post

// test post show
// expect status is ok
// expect contents to contain the given post's title

// test post create
// with csrf and set session
// expect redirection

// test post delete
// setup similar to creating a post with csrf and session
// expect redirection

// test post delete
// setup similar to creating a post with csrf and session
// expect redirection