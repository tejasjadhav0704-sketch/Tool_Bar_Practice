# Android Navigation Drawer (Hamburger Menu) - Kotlin

A simple Android application demonstrating how to create a Navigation Drawer (Hamburger Menu) using Toolbar, DrawerLayout, and NavigationView in Kotlin.

## Features

- Custom Toolbar
- Hamburger Menu (☰)
- Navigation Drawer
- Navigation Menu Items
- Click Handling with Toast Messages
- Bottom Navigation Bar

## Concepts Covered

### Toolbar

Used as the top app bar.

```kotlin
val toolBar = findViewById<Toolbar>(R.id.toolBar)
setSupportActionBar(toolBar)
```

### DrawerLayout

Acts as the parent container that manages the drawer.

```xml
<androidx.drawerlayout.widget.DrawerLayout>
```

### NavigationView

Displays menu items inside the drawer.

```xml
<com.google.android.material.navigation.NavigationView
    app:menu="@menu/drawer_menu"/>
```

### Navigation Icon Click

```kotlin
toolBar.setNavigationOnClickListener {
    drawerLayout.openDrawer(GravityCompat.START)
}
```

### Navigation Item Click Listener

```kotlin
navigationView.setNavigationItemSelectedListener {

    when(it.itemId) {

        R.id.profile -> {
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
        }

        R.id.about -> {
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
        }

        R.id.contact -> {
            Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show()
        }
    }

    drawerLayout.closeDrawers()
    true
}
```

## Project Structure

```text
app
│
├── java/kotlin
│   └── MainActivity.kt
│
├── res
│   ├── layout
│   │   └── activity_main.xml
│   │
│   ├── menu
│   │   ├── menu.xml
│   │   └── drawer_menu.xml
│   │
│   └── drawable
│       └── hamburger_icon.xml
│
└── AndroidManifest.xml
```

## Drawer Layout Structure

```text
DrawerLayout
│
├── Main Layout
│   ├── Toolbar
│   ├── Content
│   └── BottomNavigationView
│
└── NavigationView
    ├── Profile
    ├── About
    └── Contact
```

## Application Flow

```text
User Clicks ☰
        ↓
Toolbar Click Listener
        ↓
DrawerLayout Opens
        ↓
NavigationView Appears
        ↓
User Selects Menu Item
        ↓
Navigation Item Listener Executes
```

## Output

### Closed Drawer

```text
☰ My First Toolbar

------------------

Content Area

------------------

Bottom Navigation
```

### Open Drawer

```text
┌──────────────┐
│ Profile      │
│ About        │
│ Contact      │
└──────────────┘
```

## Technologies Used

- Kotlin
- Android Studio
- AndroidX
- Material Design Components

## Learning Outcomes

After completing this project, you will understand:

- Toolbar
- Navigation Icon
- DrawerLayout
- NavigationView
- Navigation Drawer
- Menu Resources
- Click Listeners
- Bottom Navigation
- Basic Android UI Navigation

Download Git on your system

Clone the repository:

```bash
git clone https://github.com/tejasjadhav0704-sketch/Tool_Bar_Practice.git
```

Then:

1. Open in Android Studio  
2. Sync Gradle  
3. Run the app  

---

## 👨‍💻 Author

Tejas Jadhav  
GitHub: https://github.com/tejasjadhav0704-sketch
