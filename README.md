# VideoStoreManager
This project is a video store management system implemented in Java. The project aims to demonstrate object-oriented programming principles by modelling a video store and implementing classes to manage videos, customers, and their interactions. It is a  console-based application for managing a video rental store. It allows the user to maintain a list of customers and videos, borrow a video, and list all available videos in the store.

## Features
A list of pre-set customers and videos in the store.
A feature to borrow a video by a customer.
Capability to restrict a customer from borrowing more than 2 videos at a time.
System will track if a video is already on loan and when it is expected to be returned.
Provides a list of all videos with their current status (on loan or on the shelf).
An interactive console-based user interface.

## Classes

### Video
The Video class represents a video that can be borrowed from the store. It contains the following fields:

titleofvideo: The title of the video.
Datetobereturned: The date when the video is expected to be returned if it is on loan.
isitonloan: A boolean indicating whether the video is currently on loan.
Customer
The Customer class represents a customer of the store. It contains the following fields:

nameofcustomer: The name of the customer.
numberofborrowedvideos: The number of videos currently borrowed by the customer.

### VideoStore
The VideoStore class represents the video store itself. It manages the list of videos and customers and contains methods to borrow videos and list all videos in the store.

### VideoTest
The VideoTest class contains the main method, which drives the application. It provides an interactive console-based interface for users to borrow videos or list all videos in the store.

### Usage
Run the VideoTest class's main method to start the application. The console will display a menu with three options: "List", "Borrow", and "Quit". Enter "L", "B", or "Q" to select one of these options.

"List": This will display a list of all videos in the store with their current status (on the shelf or on loan).
"Borrow": This will prompt the user to enter the name of a customer and a video title. The specified customer will borrow the video. If the customer has already borrowed two videos or the video is already on loan, an appropriate message will be displayed.
"Quit": This will end the application.

### Contribute
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
