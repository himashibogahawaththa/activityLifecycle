# activityLifecycle
![Screenshot (246)](https://github.com/himashibogahawaththa/activityLifecycle/assets/87941964/7e13856f-cd6b-4c7c-82a5-f227fbb66e51)
![Screenshot (247)](https://github.com/himashibogahawaththa/activityLifecycle/assets/87941964/a524c3ca-e9bd-4d9a-8434-e30a5664cb91)

This project demonstrates the basic implementation of the Activity lifecycle in an Android application. The Activity lifecycle consists of various states that an activity goes through during its creation, execution, and termination. Understanding the Activity lifecycle is crucial for managing the behavior and resources of an Android app effectively.

# Activity Lifecycle Overview
The Activity lifecycle consists of the following main states:

onCreate(): This method is called when the activity is first created. It is used for initializing essential components, such as UI layout, variables, and setting up event listeners.

onStart(): Called when the activity becomes visible to the user. This state prepares the activity for user interaction.

onResume(): The activity enters the resumed state and comes to the foreground. It is the point where the activity is active and ready for user interaction.

onPause(): This state indicates that the activity is partially visible but no longer in focus. It occurs when another activity comes into the foreground, such as a dialog or an incoming phone call.

onStop(): The activity is no longer visible to the user and is considered to be in the background. It may be destroyed or brought back to the foreground, depending on the app's lifecycle.

onRestart(): Called when the activity is being restarted from a stopped state. It is followed by onStart().

onDestroy(): This method is called when the activity is about to be destroyed. It allows for releasing resources, unregistering receivers, and performing any necessary cleanup.
