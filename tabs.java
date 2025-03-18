// <!-- Note: In a real implementation, you would need JavaScript to handle tab switching -->
    <script>
        // This would be expanded in a real implementation to handle tab switching
        document.addEventListener('DOMContentLoaded', function() {
            const navLinks = document.querySelectorAll('.nav-tabs a');
            
            navLinks.forEach(link => {
                link.addEventListener('click', function(e) {
                    e.preventDefault();
                    
                    // Remove active class from all links
                    navLinks.forEach(l => l.classList.remove('active'));
                    
                    // Add active class to clicked link
                    this.classList.add('active');
                    
                    // Hide all content sections
                    document.querySelector('.homepage-content').style.display = 'none';
                    document.querySelector('.timewalk-crops-content').style.display = 'none';
                    document.querySelector('.timewalk-ships-content').style.display = 'none';
                    document.querySelector('.modeling-content').style.display = 'none';
                    
                    // Show relevant content based on clicked tab
                    const text = this.textContent.trim();
                    if (text === 'Homepage') {
                        document.querySelector('.homepage-content').style.display = 'block';
                    } else if (text === 'Projects') {
                        document.querySelector('projects.html').style.display = 'block';
                    } else if (text === 'TimeWalk Ships') {
                        document.querySelector('.timewalk-ships-content').style.display = 'block';
                    } else if (text === '3-D Modeling') {
                        document.querySelector('.modeling-content').style.display = 'block';
                    }
                });
            });
            
            // Set homepage content as visible by default
            document.querySelector('.homepage-content').style.display = 'block';
        });
    </script>