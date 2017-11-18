# pragmabrewery

According to 
http://blog.takipi.com/the-ultimate-json-library-json-simple-vs-gson-vs-jackson-vs-json/
Gson library is the best when used to manage small JSON.
Gson 2.8.2 (September 20).

Questions to the client and Answers:
Q. How big do you want your company? Do you already had a thought about how many trucks do you want to your company to have and how will you monitor all containers temperature at the same time?
A. I want to be big! I want to have a lot of trucks delivering my beer, but I also need a way to keep the quality of my product. In near future, I will need that someone else to be able to monitor the container's temperature besides the driver.
(distributed system with different ways to consume the service - RestAPI + JSON)

Q. Shane, If it's possible (and not illegal) to keep someone inside the truck's fridge, what questions would you ask him? 
A. - There's any container with inappropriate temperature? (getAlert)
   - What is the current temperature of each container? (getStatus)

Based on components - Simple but easy to maintain and grow!
Using Maven to manage dependencies.
