# Course-Recommendation-using-Student-marks
Course Recommendation System

A Machine Learning based Course Recommendation System that helps students discover the most relevant courses based on their interests, past learning history, and skills.

🚀 Features

Personalized course recommendations using content-based filtering and/or collaborative filtering

Search functionality for courses by topic, category, or keywords

User-friendly interface to input skills/interests

Dataset support from Kaggle / scraped course platforms (Coursera, Udemy, edX)

Deployed with a simple Flask/Django web app (or Streamlit for demo)

🛠️ Tech Stack

Python – core language

Pandas, NumPy – data preprocessing

scikit-learn – recommendation algorithms

NLTK / spaCy – text processing (for course descriptions)

Flask / Streamlit – frontend demo app

SQLite / MongoDB – (optional) store course data

📊 Recommendation Algorithms Used

Content-Based Filtering: Recommends courses similar to the ones a user has taken/interested in (using TF-IDF + cosine similarity).

Collaborative Filtering (optional): Suggests courses based on what other students with similar preferences liked.
