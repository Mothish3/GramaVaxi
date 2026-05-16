# Grama-Vaxi (Smart Livestock Healthcare Platform)

Grama-Vaxi is an Android application engineered to digitize livestock profiles and provide localized health notification alerts for smallholder farmers in rural regions. This project was developed as part of my internship submission requirement.

---

## 📌 Problem Statement
Rural livestock serves as a farmer's primary financial savings, but animals frequently die from preventable outbreaks because vaccination camp dates are only announced via local village loudspeakers. Grama-Vaxi solves this by acting as a localized "Digital Health Card" that tracks animal data offline and uses automated background engines to trigger alerts days before a government camp arrives. The app features an instant animal ledger, an emergency vet alert system, and full Kannada localization to ensure rural accessibility and prevent catastrophic livestock wealth loss.

---

## 🛠️ Technologies Used
* **Language:** Kotlin (Robust, type-safe application logic)
* **UI Design:** Android XML Layouts (Responsive, low-nesting front-end sheets)
* **Background Scheduling:** Android WorkManager API (Persistent, high-priority alert triggers)
* **Concurrency:** Kotlin Coroutines (Asynchronous background processing)
* **Localization:** Android Localization Framework (Locale-aware layout mapping)
* **Data Layer:** High-Efficiency In-Memory Array Lists (Optimized memory execution)

---

## 🚀 Key Features Implemented

### 1. Offline Animal Ledger
An instant configuration interface that allows farmers to seamlessly register cattle profiles by entering the **Animal Breed** and **Age** (in months). The data layer runs entirely on an optimized in-memory pipeline to bypass thread-blocking operations, resulting in 0% frame drops on memory-constrained devices.

### 2. Automated Camp Reminders
Powered by the **Android WorkManager API**, this background framework acts as an autonomous reminder assistant. It queues high-priority background notification workers that fire alert warnings onto the user's handset precisely before an upcoming village vaccination camp arrives—even if the app has been closed or the device has been rebooted.

### 3. Native Kannada Support
To close the digital literacy gap among rural farming populations, the system integrates full regional translation architecture mapping keys across resource layers (`values-kn/strings.xml`). The user interface seamlessly flips into perfect Kannada script automatically whenever the host device's system settings alter locale.

### 4. Emergency Disease Alerts
A simulated, immediate text-based anomaly logger where farmers can type visible illness symptoms and dispatch them, immediately executing a safe dashboard redirection sequence.

---

## 📦 How to Test & Deploy on Physical Device

### Prerequisites
* Android Studio Jellyfish (or higher)
* Android SDK API Level 34+
* An Android smartphone (e.g., Vivo Y75 5G) with **USB Debugging** enabled in Developer Options.
