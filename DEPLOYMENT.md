# Private Website Deployment Guide

This guide explains how to deploy your CSE1001 assignments website privately using various methods.

## 🌐 Website Overview

Your website showcases all your Java programming assignments in a professional, easy-to-navigate format. It includes:
- Clean, modern design
- Responsive layout for all devices
- Assignment categorization and descriptions
- Professional portfolio presentation

## 🔒 Private Deployment Options

### Option 1: GitHub Pages (Recommended for Private Repos)

**Requirements:** GitHub Pro/Team account for private repository Pages

1. **Enable GitHub Pages:**
   - Go to your repository on GitHub
   - Navigate to Settings → Pages
   - Under "Source", select "GitHub Actions"
   - The workflow file `.github/workflows/static.yml` is already configured

2. **Access Control:**
   - Your website will be accessible only to repository collaborators
   - URL format: `https://abhijit-byte.github.io/CSE1001/`

3. **Automatic Deployment:**
   - Website updates automatically when you push to the main branch
   - No manual deployment needed

### Option 2: Netlify (Free with Password Protection)

1. **Setup:**
   ```bash
   # Install Netlify CLI
   npm install -g netlify-cli
   
   # Login to Netlify
   netlify login
   
   # Deploy from project root
   netlify deploy --prod
   ```

2. **Add Password Protection:**
   - Go to Netlify dashboard
   - Select your site → Site settings → Access control
   - Enable "Password protection"

### Option 3: Vercel (Free with Access Control)

1. **Setup:**
   ```bash
   # Install Vercel CLI
   npm install -g vercel
   
   # Deploy
   vercel --prod
   ```

2. **Access Control:**
   - Use Vercel's password protection feature
   - Configure in project settings

### Option 4: Local Development Server

For completely private local access:

```bash
# Using Python (if installed)
python -m http.server 8000

# Using Node.js (if installed)
npx http-server

# Using PHP (if installed)
php -S localhost:8000
```

Then access: `http://localhost:8000`

## 🛡️ Privacy and Security Features

### 1. Repository Privacy
- Keep your repository private
- Only invite trusted collaborators
- Use access tokens for deployment

### 2. Environment Variables
If you need to add sensitive information later:
```javascript
// Use environment variables for sensitive data
const API_KEY = process.env.API_KEY || 'your-fallback-key';
```

### 3. .gitignore Configuration
The following files are automatically excluded:
```
node_modules/
.env
*.log
dist/
.DS_Store
```

## 📁 File Structure

```
CSE1001/
├── index.html          # Main website page
├── style.css           # Styling and responsive design
├── script.js           # Interactive features
├── .github/
│   └── workflows/
│       └── static.yml  # GitHub Pages deployment
├── ICP Assignment 1/   # Assignment files
├── ICP Assignment 2/   # Assignment files
├── ICP Assignment 3/   # Assignment files
├── ICP Assignment 4/   # Assignment files
└── README.md          # Project documentation
```

## 🚀 Deployment Steps

### Quick Start (GitHub Pages)
1. Push your changes to the main branch
2. Go to repository Settings → Pages
3. Enable Pages with GitHub Actions source
4. Wait 2-3 minutes for deployment
5. Access your private website!

### Custom Domain (Optional)
1. Purchase a domain name
2. Configure DNS settings:
   ```
   Type: CNAME
   Name: www
   Value: abhijit-byte.github.io
   ```
3. Add custom domain in GitHub Pages settings

## 🔧 Customization Options

### Adding New Assignments
1. Update the assignments array in `script.js`
2. Add new assignment cards in `index.html`
3. Update the statistics in the about section

### Modifying Styling
- Edit `style.css` for visual changes
- Update color schemes by modifying CSS variables
- Responsive breakpoints can be adjusted

### Enhanced Features
Consider adding:
- Code syntax highlighting
- Assignment download links
- Contact form
- Search functionality

## 📊 Analytics and Monitoring

### Google Analytics (Optional)
Add to `<head>` section of `index.html`:
```html
<!-- Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=GA_MEASUREMENT_ID"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());
  gtag('config', 'GA_MEASUREMENT_ID');
</script>
```

## 🔍 Troubleshooting

### Common Issues:

1. **Pages not deploying:**
   - Check Actions tab for build errors
   - Ensure workflow file is in correct location
   - Verify repository permissions

2. **Styling not loading:**
   - Check file paths are relative
   - Ensure CSS/JS files are committed
   - Clear browser cache

3. **Mobile display issues:**
   - Verify viewport meta tag
   - Test responsive breakpoints
   - Check touch-friendly navigation

## 📞 Support

For deployment issues:
1. Check GitHub Actions logs
2. Review deployment service documentation
3. Verify file permissions and paths

## 🔄 Updates and Maintenance

### Regular Updates:
- Keep dependencies current
- Monitor deployment logs
- Test website functionality
- Update assignment content as needed

### Backup Strategy:
- Repository is your primary backup
- Export website periodically
- Document any custom configurations

---

**Note:** This website showcases your programming skills professionally while maintaining privacy controls. Choose the deployment method that best fits your privacy and accessibility needs.