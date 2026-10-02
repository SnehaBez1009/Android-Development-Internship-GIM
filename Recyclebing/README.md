# 📱 RecycleBing - Task 4

A simple Android application created using **Kotlin**, **RecyclerView**, and **CardView** to display a list of Friend Requests with dynamic names and mutual friends count.

---

## 📋 Features

- 📜 **RecyclerView Integration**: Efficiently renders a list of items.
- 🎴 **CardView Layout**: Clean card UI for each friend request.
- 📦 **Array Data Structure**: Passes data using Kotlin `Array<FriendRequest>`.
- 🔘 **Action Buttons**: Includes "Confirm" and "Delete" buttons for each item.

---

## 🛠️ Tech Stack

- **Language:** Kotlin
- **UI:** RecyclerView, CardView, TextView, Button
- **IDE:** Android Studio

---

## 📂 Project Structure

```text
Recyclebing/
├── app/
│   └── src/main/
│       ├── java/com/example/recyclebing/
│       │   ├── FriendRequest.kt        # Data model
│       │   ├── FriendRequestAdapter.kt # RecyclerView adapter
│       │   └── MainActivity.kt         # Main activity with Array data
│       └── res/
│           └── layout/
│               ├── activity_main.xml       # Main layout with RecyclerView
│               └── item_friend_request.xml # CardView layout for each item
└── build.gradle.kts
```

---

## 🚀 How to Run

1. Open **Android Studio**.
2. Click on **Open** and select the `Recyclebing` project folder.
3. Wait for Gradle sync to complete.
4. Run the app on an Emulator or Physical Device (`Shift + F10`).
